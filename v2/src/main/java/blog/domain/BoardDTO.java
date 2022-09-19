package blog.domain;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("boardDTO")
public class BoardDTO {
    private int seq;
    private String title;
    private String content;
    private String writer;
    private int password;
    private Timestamp regDate;
    private int cnt;

    public BoardDTO() {
    }

    public BoardDTO(String title, String content, String writer, int password) {
        super();
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.password = password;
        this.cnt = 0;
    }

    // getter, setter 생략
}