package com.example.academy.controller;

import com.example.academy.dto.request.ResultRequestDto;
import com.example.academy.service.inter.ResultService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/result")
@RequiredArgsConstructor
public class ResulController {

    private final ResultService resultService;

    @PostMapping
    public  double getResultPercentage(@RequestBody List<ResultRequestDto> resultRequestDto){
        return resultService.getResultPercentage (resultRequestDto);
    }

}
