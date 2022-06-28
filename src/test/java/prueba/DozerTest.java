package prueba;

import java.util.Date;

import org.dozer.CustomFieldMapper;
import org.dozer.DozerBeanMapper;
import org.dozer.classmap.ClassMap;
import org.dozer.fieldmap.FieldMap;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DozerTest {

	DozerBeanMapper mapper;

	@BeforeEach
	public void before() throws Exception {
	    mapper = new DozerBeanMapper();
	}
	
	@Test
	public void givenSourceObjectAndDestClass_whenMapsSameNameFieldsCorrectlythenCorrect() {
	    Source source = new Source("Baeldung", 10);
	    Intermedio inter = new Intermedio();
	    inter.setFecha(new Date());
	    inter.setObservaciones("Observaciones intermedias");
	    source.setIntermedio(inter);
	    Dest dest = mapper.map(source, Dest.class);

	    Assert.assertEquals(dest.getName(), "Baeldung");
	    Assert.assertEquals(dest.getAge(), 10);
	    Assert.assertEquals(dest.getIntermedio().getObservaciones(), "Observaciones intermedias");
	}
	
	@Test
	public void test01() {
		CommentDetailsResponseExtendDto source = new CommentDetailsResponseExtendDto();
		source.setBookId(100);
		source.setComment("Comentario");
		source.setEmail("agat@gmail.com");
		source.setId(1);
		source.setNick("agat");
		source.setScore(10);
		
		CommentResponseDto dest = mapper.map(source, CommentResponseDto.class);

		Assert.assertEquals(dest.getComment(), source.getComment());
		Assert.assertEquals(dest.getEmail(), source.getEmail());
		Assert.assertEquals(dest.getNick(), source.getNick());
	}
	
	@Test
	public void test02() {
		CommentResponseDto source = new CommentResponseDto();
		source.setComment("Comentario");
		source.setEmail("agat@gmail.com");
		source.setNick("agat");
		
		CommentDetailsResponseExtendDto dest = mapper.map(source, CommentDetailsResponseExtendDto.class);

		Assert.assertEquals(dest.getComment(), source.getComment());
		Assert.assertEquals(dest.getEmail(), source.getEmail());
		Assert.assertEquals(dest.getNick(), source.getNick());
	}
	
	@Test
	public void test03() {
		Comment source = new Comment();
		source.setId(10l);
		source.setComment("Comentario");
		source.setScore(9);
		
		Book book = new Book();
		book.setAuthor("Un autor");
		book.setEditorial("Anaya");
		book.setId(100l);
		book.setPublicationYear(2021);
		book.setSummary("Resumen");
		book.setTitle("Titulo del libro");
		source.setBook(book);
		
		User user = new User();
		user.setEmail("agat@gmail.com");
		user.setNick("agat");
		source.setUser(user);
		
		CustomFieldMapper customFieldMapper = new CustomFieldMapper() {
			@Override
			public boolean mapField(Object source, Object destination, Object sourceFieldValue, ClassMap classMap, FieldMap fieldMapping) {
				
				return true;
			}
			
		};
//		mapper.setCustomFieldMapper(customFieldMapper);
//		DozerConverter customConverter = new DozerConverter<A, B>();
//		List<CustomConverter> customConverters = Arrays.asList(customConverter);
//		mapper.setCustomConverters(customConverters);
		CommentDetailsResponseExtendDto dest = mapper.map(source, CommentDetailsResponseExtendDto.class);

		Assert.assertEquals(dest.getComment(), source.getComment());

	}
}
