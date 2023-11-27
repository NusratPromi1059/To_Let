package org.np.tolet.service;

import org.np.tolet.domain.Area;

import java.io.IOException;
import java.util.Set;

public interface AreaService {
    Set<Area> getAllAreas() throws IOException;
}
