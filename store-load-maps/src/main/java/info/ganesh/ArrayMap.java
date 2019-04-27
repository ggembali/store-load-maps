package info.ganesh;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrayMap {

	public Map<String, String>[] load(String text) throws WrongFormatException {
		try {
			return this.load(new ByteArrayInputStream(text.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public Map<String, String>[] load(InputStream inputStream) throws IOException, WrongFormatException {
		InputStreamReader reader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(reader);
		String currentLine = bufferedReader.readLine();

		List<Map> arrayListmaps = new ArrayList<>();

		while (currentLine != null) {
			Map<String, String> map = convertLineToMap(currentLine);

			arrayListmaps.add(map);
			currentLine = bufferedReader.readLine();

		}
		Map<String, String>[] arrayMap = new HashMap[arrayListmaps.size()];

		return (Map[]) arrayListmaps.toArray(arrayMap);
	}

	private Map<String, String> convertLineToMap(String currentLine) throws WrongFormatException {
		Map<String, String> map = new HashMap<>();
		byte[] bytes = currentLine.getBytes();
		String key = null;
		String value = null;
		StringBuffer stringbuffer = new StringBuffer();

		for (int i = 0; i < bytes.length; i++) {
			if (bytes[i] == '=') {
				key = stringbuffer.toString();
				stringbuffer = new StringBuffer();
			} else if (bytes[i] == ';') {
				value = stringbuffer.toString();
				if (key == null || value == null) {
					throw new WrongFormatException();
				} else {
					map.put(key, value);
				}
				stringbuffer = new StringBuffer();
			} else {
				stringbuffer.append((char) bytes[i]);
			}
		}

		value = stringbuffer.toString();
		if (key == null || value == null) {
			throw new WrongFormatException();
		} else {
			map.put(key, value);
		}
		return map;
	}

	public String store(Map<String, String>[] arrayMaps) {
		StringWriter stringWriter = new StringWriter();
		try {
			store(arrayMaps,stringWriter);
			return stringWriter.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

	public void store(Map<String, String>[] arrayMaps, Writer writer) throws IOException {
		for (int i = 0; i < arrayMaps.length; i++) {
			writeMapToLine(arrayMaps[i], writer);
			writer.write('\n');
		}
	}

	private void writeMapToLine(Map<String, String> map, Writer writer) throws IOException {
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			writer.write(key);
			writer.write('=');
			writer.write(map.get(key));
			if (iterator.hasNext()) {
				writer.write(';');
			}
		}
	}

}
