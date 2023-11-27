package org.np.tolet.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.np.tolet.domain.Area;
import org.np.tolet.service.AreaService;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class AreaServiceImpl implements AreaService {
    private final String areaFileLocation = FileLocation.areaFile;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Set<Area> getAllAreas() throws IOException {
        return objectMapper.readValue(new File(areaFileLocation), new TypeReference<>() {
        });
    }
}
