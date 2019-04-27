package info.ganesh;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ArrayMapTest {
	private InputStream inputStream;
	private ArrayMap arrayMap = new ArrayMap();

	@Test
	public void shouldLoadArrayMapFromGivenStream() throws IOException, WrongFormatException {
		inputStream = this.getClass().getClassLoader().getResourceAsStream("sampleArrayMap");
		Map<String, String>[] load = arrayMap.load(inputStream);
		assertThat(load.length, is(2));
	}

	@Test
	public void shouldStoreArrayMapIntoAStream() {
		HashMap<String, String> map = new HashMap<String, String>() {
			private static final long serialVersionUID = 1L;

			{
				put("key1", "value1");
				put("key2", "value2");
			}
		};
		
		Map<String, String>[] arrayMapData = new HashMap[1];
		arrayMapData[1] = map;
		StringWriter writer = new StringWriter();
		arrayMap.store(arrayMap, writer);
		assertThat(writer.toString(),is("key1=value1;key2=value2"));
	}

}
