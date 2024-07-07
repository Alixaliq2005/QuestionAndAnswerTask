package com.example.academy.service.inter;

import com.example.academy.dto.request.ResultRequestDto;

import java.util.List;

public interface ResultService {
    double getResultPercentage(List<ResultRequestDto> resultRequestDto);
}
