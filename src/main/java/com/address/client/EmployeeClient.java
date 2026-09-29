package com.address.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("employeeClient", url = "${employee.service.url}")
public interface EmployeeClient {
}
