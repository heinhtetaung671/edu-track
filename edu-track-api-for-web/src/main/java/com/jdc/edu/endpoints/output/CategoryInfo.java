package com.jdc.edu.endpoints.output;

import java.util.UUID;

public record CategoryInfo(UUID id, String name, String description, long courses) {

}
