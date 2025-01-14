package com.backbase.goldensample.review.mapper;

import com.backbase.goldensample.review.dto.ReviewDTO;
import com.backbase.goldensample.review.persistence.ReviewEntity;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntityMapper {

    ReviewDTO entityToDto(ReviewEntity entity);

    ReviewEntity dtoToEntity(ReviewDTO dto);

    List<ReviewEntity> dtoListToEntityList(List<ReviewDTO> entity);

    List<ReviewDTO> entityListToDtoList(List<ReviewEntity> api);
}
