package roomescape.theme.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import roomescape.theme.domain.Theme;

public interface ThemeRepository {
    List<Theme> getAll();

    Theme put(Theme theme);

    boolean deleteById(long id);

    Optional<Theme> findById(long id);

    List<Theme> findTop10PopularThemesWithinLastWeek(LocalDate nowDate);
}
