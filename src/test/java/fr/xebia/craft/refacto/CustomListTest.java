package fr.xebia.craft.refacto;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;


public class CustomListTest {

	@Test
	public void shouldAddOneElement() throws Exception {
		//Given
		CustomList list = new CustomList();
		
		//When
		list.setReadOnly(false);
		list.add("Toto");

		//Then
		assertThat(list.getElement(0)).isEqualTo("Toto");
	}
	
	@Test
	public void shouldNotAddElementIfReadOnly() throws Exception {
		//Given
		CustomList list = new CustomList();
		
		//When
		list.add("Toto");
	
		//Then
		assertThat(list.getSize()).isEqualTo(0);
	}
	
	@Test
	public void shouldResizeListAfter10Elements() throws Exception {
		//Given
		CustomList list = new CustomList();
		
		//When
		list.setReadOnly(false);
		for(int i = 0; i <= 10; i++)
			list.add("Toto");
	
		//Then
		assertThat(list.getSize()).isEqualTo(11);
	}
	
}
