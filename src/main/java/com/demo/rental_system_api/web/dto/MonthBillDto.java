package com.demo.rental_system_api.web.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MonthBillDto {
    private Integer id;
    private Date dueDate;
    private Date paymentDate;
    private Float totalPrice;
    private String note;

    private ContractDto contractDto;

    @Data
    public static class UsedServiceDto {
        private ServiceDto serviceDto;
        private Integer quantity;
        private Float totalPrice;
    }
}
