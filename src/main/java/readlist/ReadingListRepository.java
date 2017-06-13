package readlist;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 周高磊 on 2017/6/13.
 * Desc: 仓库接口
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
