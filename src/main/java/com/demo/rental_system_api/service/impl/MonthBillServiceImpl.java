package com.demo.rental_system_api.service.impl;

import com.demo.rental_system_api.service.MonthBillService;
import com.demo.rental_system_api.web.dto.MonthBillDto;
import com.demo.rental_system_api.web.dto.request.CreateMonthBillRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class MonthBillServiceImpl implements MonthBillService {
    @Override
    public List<MonthBillDto> getBillOfContract(Integer contractId) {
        return null;
    }

    @Override
    public MonthBillDto getBillById(Integer billId) {
        return null;
    }

    @Override
    public MonthBillDto createBill(CreateMonthBillRequest createMonthBillRequest) {
        return null;
    }
}
