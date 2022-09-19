package blog.dao;

import blog.domain.BoardDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDaoMyBatis implements BoardDao {
    private SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<BoardDTO> list() {
        return sqlSessionTemplate.selectList("list");
    }

    @Override
    public int delete(BoardDTO boardDTO) {
        // 인자로써 SQL 스크립트 파일에 명시된 id와 parameterType의 객체를 준다.
        return sqlSessionTemplate.delete("delete", boardDTO);
    }

    @Override
    public int deleteAll() {
        return sqlSessionTemplate.delete("deleteAll");
    }

    @Override
    public int update(BoardDTO boardDTO) {
        return sqlSessionTemplate.update("update", boardDTO);
    }

    @Override
    public int insert(BoardDTO boardDTO) {
        return sqlSessionTemplate.insert("insert", boardDTO);
    }

    @Override
    public BoardDTO select(int seq) {
        return sqlSessionTemplate.selectOne("select", seq);
    }

    @Override
    public int updateReadCount(int seq) {
        return sqlSessionTemplate.update("updateCount", seq);
    }

}