// Rule 03. Numeric Types and Operations
// NUM03_J. Use integer types that can fully represent the possible range of unsigned data
public static long getInteger(DataInputStream is) throws IOException {
  return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
}
