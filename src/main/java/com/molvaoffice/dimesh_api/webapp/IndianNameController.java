package com.molvaoffice.dimesh_api.webapp;

import com.molvaoffice.dimesh_api.business.IndianNameService;
import com.molvaoffice.dimesh_api.domain.dto.IndianNameAndSurnameDTO;
import com.molvaoffice.dimesh_api.domain.dto.IndianNameDTO;
import com.molvaoffice.dimesh_api.domain.dto.IndianSurnameDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("india")
public class IndianNameController {

    private final IndianNameService indianNameService;

    public IndianNameController(IndianNameService indianNameService) {
        this.indianNameService = indianNameService;
    }

    @GetMapping("/all/names")
    @ResponseBody
    public List<IndianNameDTO> getAllIndianNames() {
        return indianNameService.getAllIndianNames();
    }

    @GetMapping("/all/surnames")
    @ResponseBody
    public List<IndianSurnameDTO> getAllIndianSurnames() {
        return indianNameService.getAllIndianSurnames();
    }

    @GetMapping("/random")
    @ResponseBody
    public IndianNameAndSurnameDTO getIndianNameAndSurname() {
        return indianNameService.getRandomIndianNameAndSurname();
    }
}
