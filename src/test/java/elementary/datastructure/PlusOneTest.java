package elementary.datastructure;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOneTest {

	@Test
	public void plusOneEmptyListShouldReturnEmptyList() {
		List<Integer> result = PlusOne.plusOne(new ArrayList<>());
		Assert.assertEquals(0, result.size());
	}

	@Test
	public void plusOne129ShouldReturn130() {
		List<Integer> result = PlusOne.plusOne(new ArrayList<>(Arrays.asList(1,2,9)));
		Assert.assertTrue(Arrays.asList(1,3,0).equals(result));
	}

	@Test
	public void plusOne999ShouldReturn1000() {
		List<Integer> result = PlusOne.plusOne(new ArrayList<>(Arrays.asList(9,9,9)));
		Assert.assertTrue(Arrays.asList(1,0,0,0).equals(result));
	}
}
