package abstracted;

import IdChecker.IdChecker;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import  java.util.Random;

abstract public class Sounds {
   public String[] sound = new String[] {"скрежет", "что-то упало", "звуки животных", "звуки погони", "мррряууу", "пиу-пиу-пиу"};

   public String getSound(String[] sound){
      String myState;

      int min = 0;
      int max = sound.length-1;
      int diff = max - min;
      Random random = new Random();
      int i = random.nextInt(diff + 1);
      i += min;

      myState = sound[i];

      return myState;
   }

   public String equals(String id, IdChecker checker, ArrayList<Object> models){
      String myState;
      checker.take(models);
      myState = checker.check(id);
      return myState;
   }

   public byte[] hashCode(String makeSense,byte[] byteArray){
      try {

         Charset charset = StandardCharsets.US_ASCII;

         byte[] byteString = charset.encode(makeSense).array();

         Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
         SecretKey secretKey = new SecretKeySpec(byteArray, "AES");

         cipher.init(Cipher.ENCRYPT_MODE, secretKey);

         return cipher.doFinal(byteString);

      } catch (NoSuchAlgorithmException e) {
         throw new RuntimeException(e);
      } catch (NoSuchPaddingException e) {
         throw new RuntimeException(e);
      } catch (InvalidKeyException e) {
         throw new RuntimeException(e);
      } catch (IllegalBlockSizeException e) {
         throw new RuntimeException(e);
      } catch (BadPaddingException e) {
         throw new RuntimeException(e);
      }
   }

}
