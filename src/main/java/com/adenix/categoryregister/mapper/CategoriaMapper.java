package com.adenix.categoryregister.mapper;
import com.adenix.categoryregister.domain.Categoria;
import com.adenix.categoryregister.requests.CategoriaPostReqBody;
import com.adenix.categoryregister.requests.CategoriaPutReqBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper(componentModel = "spring")
public abstract class CategoriaMapper {
public static final CategoriaMapper INSTANCE = Mappers.getMapper(CategoriaMapper.class);
public abstract Categoria toCategoria(CategoriaPostReqBody categoriaPostReqBody);
public abstract Categoria toCategoria(CategoriaPutReqBody categoriaPutReqBody);

}