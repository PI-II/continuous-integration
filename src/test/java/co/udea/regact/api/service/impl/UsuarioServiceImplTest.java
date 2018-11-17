package co.udea.regact.api.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Optional;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;

import co.udea.regact.api.domain.Usuario;
import co.udea.regact.api.repository.UsuarioRepository;

@RunWith(PowerMockRunner.class)
public class UsuarioServiceImplTest {

	@Mock
	private UsuarioRepository repository;
	
	@InjectMocks
	private UsuarioServiceImpl service;
	
	
	@Before
	public void setUp() {
		//service = new UsuarioServiceImpl();
	}
	
	@Test
	@Ignore
	public void testGetUsuarios() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testGetUsuarioId() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testGetUsuarioByEmailEstado() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUsuarioLogin() {
		
		Usuario user = new Usuario();
		user.setUsuEmail("mail@mail");
		user.setUsuPassword("pwd");

		PowerMockito.when(repository.findByUsuEmailAndUsuPasswordEquals("mail@mail", "pwd")).thenReturn(Optional.of(user));
		
		Usuario result = service.getUsuarioLogin("mail@mail", "pwd");

		assertEquals(user.getUsuEmail(), result.getUsuEmail());
	}

}
