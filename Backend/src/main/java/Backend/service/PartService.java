package Backend.service;

import Backend.entity.Course;
import Backend.entity.Part;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface PartService {
    void savePart(Part part);

    Page<Part> getPartLisByCourse(Pageable pageable, Long courseId);

    List<Part> getPartListByCourse(Course course);

    Optional<Part> findPartById(Long id);

    boolean existsById(Long id);
}
