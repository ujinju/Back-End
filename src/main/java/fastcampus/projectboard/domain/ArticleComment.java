package fastcampus.projectboard.domain;

import fastcampus.projectboard.domain.Article;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article;
    private String content;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
