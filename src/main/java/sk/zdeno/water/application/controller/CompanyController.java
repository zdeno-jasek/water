package sk.zdeno.water.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.zdeno.water.application.dto.AddressDto;
import sk.zdeno.water.application.dto.CompanyDto;
import sk.zdeno.water.application.dto.PersonDto;
import sk.zdeno.water.domain.applicant.*;

@RestController
@RequestMapping("/companies")
public class CompanyController {
	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private Mapper<Company, CompanyDto> companyMapper;
	@Autowired
	private Mapper<Address, AddressDto> addressMapper;

	@GetMapping("/{id}")
	public CompanyDto getCompany(@PathVariable long id) {
		// TODO: read company from repository and return DTO
		return null;
	}

	@PostMapping
	public long createCompany( @RequestBody CompanyDto companyDto) {
		// TODO: create company from DTO and save it to repository
		return 0;
	}

}
