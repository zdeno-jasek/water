package sk.zdeno.water.application.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.zdeno.water.application.dto.WaterConnectionDto;
import sk.zdeno.water.application.dto.WaterConnectionNewDto;
import sk.zdeno.water.domain.applicant.PersonRepository;
import sk.zdeno.water.domain.events.DomainEventPublisher;
import sk.zdeno.water.domain.rules.WaterConnectionRuleFactory;
import sk.zdeno.water.domain.waterconnection.*;

@RestController
@RequestMapping("/water-connections")
public class WaterConnectionController {

    @Autowired
    private WaterConnectionRepository waterConnectionRepository;
    @Autowired
    private Build<WaterConnectionBuilder, WaterConnectionNewDto> waterConnectionMapper;
    @Autowired
    private Mapper<WaterConnection, WaterConnectionDto> waterConnectionReadMapper;
    @Autowired
    private DomainEventPublisher publisher;
    @Autowired
    private PersonRepository personRepository;

    private final static Logger logger = org.slf4j.LoggerFactory.getLogger(WaterConnectionController.class);

    //POST /water-connections
    @PostMapping
    public long createWaterConnection(@RequestBody WaterConnectionNewDto waterConnectionNewDto) {
        WaterConnectionBuilder waterConnectionBuilder = waterConnectionMapper.fromDto(waterConnectionNewDto);
        WaterConnectionRuleFactory ruleFactory = new WaterConnectionRuleFactory( personRepository );
        WaterConnectionFactory factory = new WaterConnectionFactory( publisher, ruleFactory.create() );

        WaterConnection waterConnection = null;
        long result = 0;
        try {
            waterConnection = factory.create(waterConnectionBuilder);
            waterConnectionRepository.create(waterConnection);
            result = waterConnection.getId();
        } catch (WaterConnectionException e) {
            logger.error("WaterConnectionException: " + e.getMessage());
        }
        return result;
    }

    @GetMapping("/{id}")
    public WaterConnectionDto getWaterConnection(@PathVariable long id) {
        WaterConnection waterConnection = waterConnectionRepository.read(id);
        return waterConnectionReadMapper.toDto(waterConnection);
    }

    /**
     * Approve water connection
     * @param id
     */
    // POST /water-connections/{id}/approve
    @PostMapping("/{id}/approve")
    public void approveWaterConnection(@PathVariable long id) {
        WaterConnection waterConnection = waterConnectionRepository.read(id);
        //waterConnection.approve();
        waterConnectionRepository.update(waterConnection);
    }
}
