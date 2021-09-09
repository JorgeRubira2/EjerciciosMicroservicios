package com.jorgerubira.hiberusmsejercicio01.domain.aviationstack;

import lombok.Data;

@Data
public class Pagination {
    private Integer limit;
    private Integer offset;
    private Integer count;
    private Integer total;
}
