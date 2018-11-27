package co.udea.regact.api.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Optional;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;

import co.udea.regact.api.domain.Usuario;
import co.udea.regact.api.exception.DataNotFoundException;
import co.udea.regact.api.repository.UsuarioRepository;
import co.udea.regact.api.util.Messages;

@RunWith(PowerMockRunner.class)
public class UsuarioServiceImplTest {

	@Mock
	private UsuarioRepository repository;
	@Mock
	private Messages messages;
	
	@InjectMocks
	private UsuarioServiceImpl service;
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	
	@Before
	public void setUp() {
		
	}
	
	@Test
	@Ignore
	public void testGetUsuarios() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore("Not implemented yet")
	public void testGetUsuarioId() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUsuarioByEmailEstado() {
		Usuario user = new Usuario();
		user.setUsuEmail("mail@mail");
		user.setUsuPassword("pwd");

		PowerMockito.when(repository.findByUsuEmailAndEstadoEstNombreEquals("mail@mail", "activo")).thenReturn(Optional.of(user));
		
		Usuario result = service.getUsuarioByEmailEstado("mail@mail", "activo");

		assertEquals(user.getUsuEmail(), result.getUsuEmail());
	}
	
	@Test
	public void testGetUsuarioByEmailEstadoWhenNotFoundReturnExecption() {
		
		Usuario user = new Usuario();
		user.setUsuEmail("mail@mail");
		user.setUsuPassword("pwd");
		PowerMockito.when(messages.get("exception.data_not_found.usuario")).thenReturn("Email no encontrado");
		PowerMockito.when(repository.findByUsuEmailAndEstadoEstNombreEquals("mail@mail", "inactivo")).thenReturn(Optional.empty());
		
		expectedException.expect(DataNotFoundException.class);
		expectedException.expectMessage("Email no encontrado");	
		service.getUsuarioByEmailEstado("mail@mail", "inactivo");

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
	
	@Test
	public void testGetUsuarioByEmaiPasswordWhenNotExistReturnExecption() {
		
		Usuario user = new Usuario();
		user.setUsuEmail("mail@mail");
		user.setUsuPassword("pwd");
		PowerMockito.when(messages.get("exception.data_not_found.usuario")).thenReturn("Usuario o password invalidos");
		PowerMockito.when(repository.findByUsuEmailAndUsuPasswordEquals("mail@mail", "pwd")).thenReturn(Optional.empty());
		
		expectedException.expect(DataNotFoundException.class);
		expectedException.expectMessage("Usuario o password invalidos");	
		service.getUsuarioLogin("mail@mail", "pwd");

	}

}
