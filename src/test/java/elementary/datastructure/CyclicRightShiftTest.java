package elementary.datastructure;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CyclicRightShiftTest {

	@Test
	public void shiftZero123ShouldReturn123() {
		int[] a = new int[]{1,2,3};
		ListNode<Integer> node = ListNode.fromArray(a);

		ListNode<Integer> shifted = CyclicRightShift.cyclicallyRightShiftList(node, 0);
		Assert.assertArrayEquals(a, ListNode.toArray(shifted));
	}

	@Test
	public void shiftThree12345ShouldReturn34512() {
		int[] a = new int[]{1,2,3,4,5};
		ListNode<Integer> node = ListNode.fromArray(a);

		ListNode<Integer> shifted = CyclicRightShift.cyclicallyRightShiftList(node, 3);
		Assert.assertArrayEquals(a, ListNode.toArray(shifted));
	}

	@Test
	public void shiftEight12345ShouldReturn34512() {
		int[] a = new int[]{1,2,3,4,5};
		ListNode<Integer> node = ListNode.fromArray(a);

		ListNode<Integer> shifted = CyclicRightShift.cyclicallyRightShiftList(node, 8);
		Assert.assertArrayEquals(a, ListNode.toArray(shifted));
	}
}
