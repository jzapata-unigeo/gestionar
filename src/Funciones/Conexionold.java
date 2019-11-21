/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.io.*;
import java.sql.*;
import java.util.*;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import static org.apache.commons.codec.binary.Base64.decodeBase64;

/**
 *
 * @author
 */
public class Conexionold {

    private final static String alg = "AES";
    // Definición del modo de cifrado a utilizar
    private final static String cI = "AES/CBC/PKCS5Padding";

    private static Connection cnx = null;

//    public Connection obtener() throws SQLException, ClassNotFoundException, IOException, Exception {
//        if (cnx == null) {
//            try {
//                String conexion = Conexion.archivo();
//                String key = "92AE31A79FEEB2A3";
//                String IV = "0123456789ABCDEF";
//                
//                String server = Conexion.decrypt(key, IV, conexion);
//                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//               // System.out.println(server);
//                cnx = DriverManager.getConnection("jdbc:sqlserver:" + server);
//               //System.out.println("Conexion exitosa");
//
//            } catch (SQLException ex) {
//                throw new SQLException(ex);
//            } catch (ClassNotFoundException ex) {
//                throw new ClassCastException(ex.getMessage());
//            }
//
//        }
//        return cnx;
//
//    }

    public void cerrar() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }

    }

    public static String archivo() throws FileNotFoundException, IOException {
        BufferedReader ent = new BufferedReader(new FileReader("datos.config"));
        PrintWriter sal = new PrintWriter(System.out, true);
        String conec;
        StringTokenizer stt;
        String linea = ent.readLine();
        stt = new StringTokenizer(linea, " ");
        conec = stt.nextToken();
        return conec;

    }

    public static String decrypt(String key, String iv, String encrypted) throws Exception {
        Cipher cipher = Cipher.getInstance(cI);
        SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), alg);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes());
        byte[] enc = decodeBase64(encrypted);
        cipher.init(Cipher.DECRYPT_MODE, skeySpec, ivParameterSpec);
        byte[] decrypted = cipher.doFinal(enc);
        return new String(decrypted);
    }

}
