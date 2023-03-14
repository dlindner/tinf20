package de.dhbw.tinf20.mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Test;
import org.mockito.Mockito;

public class AutoTest {

	@Test
	public void geplante_Obsoleszenz() {
		Auto target = new Auto(
			11,
			new Motor()
		);
		assertThat(
			target.istMotorwarnleuchteAn()
		).isTrue();
	}
	
	@Test
	public void davor_hängt_es_vom_Motor_ab() {
		Motor mockedMotor = EasyMock.mock(Motor.class);
		EasyMock.expect(mockedMotor.istDefekt()).andReturn(false);
		EasyMock.replay(mockedMotor);
		Auto target = new Auto(
			10,
			mockedMotor
		);
		assertThat(
			target.istMotorwarnleuchteAn()
		).isFalse();
	}

	@Test
	public void davor_hängt_es_vom_Motor_ab2() {
		Motor mockedMotor = EasyMock.mock(Motor.class);
		EasyMock.expect(mockedMotor.istDefekt()).andReturn(true);
		EasyMock.replay(mockedMotor);
		Auto target = new Auto(
			10,
			mockedMotor
		);
		assertThat(
			target.istMotorwarnleuchteAn()
		).isTrue();
	}
}
