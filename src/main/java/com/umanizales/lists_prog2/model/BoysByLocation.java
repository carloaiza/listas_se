package com.umanizales.lists_prog2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 */

@Data
@AllArgsConstructor
public class BoysByLocation {
    private Location location;
    private int count;
}
