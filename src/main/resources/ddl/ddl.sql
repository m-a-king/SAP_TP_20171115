CREATE TABLE `products`
(
    `product_id`   INT AUTO_INCREMENT PRIMARY KEY COMMENT '제품 식별자',
    `model`        VARCHAR(255) NOT NULL COMMENT '제품 모델',
    `category`     VARCHAR(255) NOT NULL COMMENT '제품 카테고리',
    `release_date` DATE         NOT NULL COMMENT '제품 출시일',
    UNIQUE (`model`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci;

CREATE TABLE `specifications`
(
    `spec_id`    INT AUTO_INCREMENT PRIMARY KEY COMMENT '제품 사양 식별자',
    `product_id` INT          NOT NULL COMMENT '제품 식별자',
    `processor`  VARCHAR(255) NOT NULL COMMENT '제품 프로세서',
    `memory`     VARCHAR(255) NOT NULL COMMENT '제품 메모리',
    `storage`    VARCHAR(255) NOT NULL COMMENT '제품 저장 용량',
    `display`    VARCHAR(255) NOT NULL COMMENT '제품 디스플레이',
    `color`      VARCHAR(255) COMMENT '제품 색상',
    `battery`    VARCHAR(255) COMMENT '제품 배터리 용량',
    `camera`     VARCHAR(255) COMMENT '제품 카메라 사양',
    `os`         VARCHAR(255) COMMENT '운영 체제',
    FOREIGN KEY (product_id) REFERENCES `products` (product_id) ON DELETE CASCADE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci;

CREATE TABLE `reviews`
(
    `review_id`  INT AUTO_INCREMENT PRIMARY KEY COMMENT '리뷰 식별자',
    `product_id` INT          NOT NULL COMMENT '제품 식별자',
    `reviewer`   VARCHAR(255) NOT NULL COMMENT '리뷰 작성자',
    `rating`     INT          NOT NULL COMMENT '제품 평점',
    CHECK (rating BETWEEN 1 AND 5),
    `comment`    TEXT COMMENT '제품 피드백',
    CONSTRAINT `reviews_product_id` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`) ON DELETE CASCADE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci;

CREATE TABLE `product_images`
(
    `image_id`    INT AUTO_INCREMENT PRIMARY KEY COMMENT '이미지 식별자',
    `product_id`  INT          NOT NULL COMMENT '제품 식별자',
    `image_url`   VARCHAR(255) NOT NULL COMMENT '이미지 URL',
    `description` TEXT COMMENT '이미지 설명',
    CONSTRAINT `product_images_id` FOREIGN KEY (product_id) REFERENCES `products` (product_id) ON DELETE CASCADE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci;
