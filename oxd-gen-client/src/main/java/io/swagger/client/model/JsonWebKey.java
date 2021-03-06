/*
 * oxd-server
 * oxd-server
 *
 * OpenAPI spec version: 4.2
 * Contact: yuriyz@gluu.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * JsonWebKey
 */


public class JsonWebKey {
  @SerializedName("kid")
  private String kid = null;

  @SerializedName("kty")
  private String kty = null;

  @SerializedName("use")
  private String use = null;

  @SerializedName("alg")
  private String alg = null;

  @SerializedName("crv")
  private String crv = null;

  @SerializedName("exp")
  private Long exp = null;

  @SerializedName("x5c")
  private List<String> x5c = new ArrayList<String>();

  @SerializedName("n")
  private String n = null;

  @SerializedName("e")
  private String e = null;

  @SerializedName("x")
  private String x = null;

  @SerializedName("y")
  private String y = null;

  public JsonWebKey kid(String kid) {
    this.kid = kid;
    return this;
  }

   /**
   * Get kid
   * @return kid
  **/
  @Schema(required = true, description = "")
  public String getKid() {
    return kid;
  }

  public void setKid(String kid) {
    this.kid = kid;
  }

  public JsonWebKey kty(String kty) {
    this.kty = kty;
    return this;
  }

   /**
   * Get kty
   * @return kty
  **/
  @Schema(required = true, description = "")
  public String getKty() {
    return kty;
  }

  public void setKty(String kty) {
    this.kty = kty;
  }

  public JsonWebKey use(String use) {
    this.use = use;
    return this;
  }

   /**
   * Get use
   * @return use
  **/
  @Schema(required = true, description = "")
  public String getUse() {
    return use;
  }

  public void setUse(String use) {
    this.use = use;
  }

  public JsonWebKey alg(String alg) {
    this.alg = alg;
    return this;
  }

   /**
   * Get alg
   * @return alg
  **/
  @Schema(required = true, description = "")
  public String getAlg() {
    return alg;
  }

  public void setAlg(String alg) {
    this.alg = alg;
  }

  public JsonWebKey crv(String crv) {
    this.crv = crv;
    return this;
  }

   /**
   * Get crv
   * @return crv
  **/
  @Schema(description = "")
  public String getCrv() {
    return crv;
  }

  public void setCrv(String crv) {
    this.crv = crv;
  }

  public JsonWebKey exp(Long exp) {
    this.exp = exp;
    return this;
  }

   /**
   * Get exp
   * @return exp
  **/
  @Schema(example = "1563964950485", required = true, description = "")
  public Long getExp() {
    return exp;
  }

  public void setExp(Long exp) {
    this.exp = exp;
  }

  public JsonWebKey x5c(List<String> x5c) {
    this.x5c = x5c;
    return this;
  }

  public JsonWebKey addX5cItem(String x5cItem) {
    this.x5c.add(x5cItem);
    return this;
  }

   /**
   * Get x5c
   * @return x5c
  **/
  @Schema(required = true, description = "")
  public List<String> getX5c() {
    return x5c;
  }

  public void setX5c(List<String> x5c) {
    this.x5c = x5c;
  }

  public JsonWebKey n(String n) {
    this.n = n;
    return this;
  }

   /**
   * Get n
   * @return n
  **/
  @Schema(description = "")
  public String getN() {
    return n;
  }

  public void setN(String n) {
    this.n = n;
  }

  public JsonWebKey e(String e) {
    this.e = e;
    return this;
  }

   /**
   * Get e
   * @return e
  **/
  @Schema(description = "")
  public String getE() {
    return e;
  }

  public void setE(String e) {
    this.e = e;
  }

  public JsonWebKey x(String x) {
    this.x = x;
    return this;
  }

   /**
   * Get x
   * @return x
  **/
  @Schema(description = "")
  public String getX() {
    return x;
  }

  public void setX(String x) {
    this.x = x;
  }

  public JsonWebKey y(String y) {
    this.y = y;
    return this;
  }

   /**
   * Get y
   * @return y
  **/
  @Schema(description = "")
  public String getY() {
    return y;
  }

  public void setY(String y) {
    this.y = y;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonWebKey jsonWebKey = (JsonWebKey) o;
    return Objects.equals(this.kid, jsonWebKey.kid) &&
        Objects.equals(this.kty, jsonWebKey.kty) &&
        Objects.equals(this.use, jsonWebKey.use) &&
        Objects.equals(this.alg, jsonWebKey.alg) &&
        Objects.equals(this.crv, jsonWebKey.crv) &&
        Objects.equals(this.exp, jsonWebKey.exp) &&
        Objects.equals(this.x5c, jsonWebKey.x5c) &&
        Objects.equals(this.n, jsonWebKey.n) &&
        Objects.equals(this.e, jsonWebKey.e) &&
        Objects.equals(this.x, jsonWebKey.x) &&
        Objects.equals(this.y, jsonWebKey.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kid, kty, use, alg, crv, exp, x5c, n, e, x, y);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonWebKey {\n");
    
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    crv: ").append(toIndentedString(crv)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    x5c: ").append(toIndentedString(x5c)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
