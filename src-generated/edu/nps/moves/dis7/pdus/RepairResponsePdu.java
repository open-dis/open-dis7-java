/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 5.5.11 used by the receiving entity to acknowledge the receipt of a Repair Complete PDU
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class RepairResponsePdu extends LogisticsFamilyPdu implements Serializable
{
   /** Entity that requested repairs.  See 6.2.28 */
   protected EntityID  receivingEntityID = new EntityID(); 

   /** Entity that is repairing.  See 6.2.28 */
   protected EntityID  repairingEntityID = new EntityID(); 

   /** Result of repair operation uid 64 */
   protected RepairResponseRepairResult repairResult = RepairResponseRepairResult.values()[0];

   /** padding */
   protected byte  padding1 = (byte)0;

   /** padding */
   protected short  padding2 = (short)0;


/** Constructor */
 public RepairResponsePdu()
 {
    setPduType( DISPDUType.REPAIR_RESPONSE );
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize += receivingEntityID.getMarshalledSize();
   marshalSize += repairingEntityID.getMarshalledSize();
   marshalSize += repairResult.getMarshalledSize();
   marshalSize += 1;  // padding1
   marshalSize += 2;  // padding2

   return marshalSize;
}


/** Setter for {@link RepairResponsePdu#receivingEntityID}
  * @param pReceivingEntityID new value of interest
  * @return same object to permit progressive setters */
public RepairResponsePdu setReceivingEntityID(EntityID pReceivingEntityID)
{
    receivingEntityID = pReceivingEntityID;
    return this;
}

/** Getter for {@link RepairResponsePdu#receivingEntityID}
  * @return value of interest */
public EntityID getReceivingEntityID()
{
    return receivingEntityID; 
}

/** Setter for {@link RepairResponsePdu#repairingEntityID}
  * @param pRepairingEntityID new value of interest
  * @return same object to permit progressive setters */
public RepairResponsePdu setRepairingEntityID(EntityID pRepairingEntityID)
{
    repairingEntityID = pRepairingEntityID;
    return this;
}

/** Getter for {@link RepairResponsePdu#repairingEntityID}
  * @return value of interest */
public EntityID getRepairingEntityID()
{
    return repairingEntityID; 
}

/** Setter for {@link RepairResponsePdu#repairResult}
  * @param pRepairResult new value of interest
  * @return same object to permit progressive setters */
public RepairResponsePdu setRepairResult(RepairResponseRepairResult pRepairResult)
{
    repairResult = pRepairResult;
    return this;
}

/** Getter for {@link RepairResponsePdu#repairResult}
  * @return value of interest */
public RepairResponseRepairResult getRepairResult()
{
    return repairResult; 
}

/** Setter for {@link RepairResponsePdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public RepairResponsePdu setPadding1(byte pPadding1)
{
    padding1 = pPadding1;
    return this;
}
/** Utility setter for {@link RepairResponsePdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public RepairResponsePdu setPadding1(int pPadding1){
    padding1 = (byte) pPadding1;
    return this;
}

/** Getter for {@link RepairResponsePdu#padding1}
  * @return value of interest */
public byte getPadding1()
{
    return padding1; 
}

/** Setter for {@link RepairResponsePdu#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public RepairResponsePdu setPadding2(short pPadding2)
{
    padding2 = pPadding2;
    return this;
}
/** Utility setter for {@link RepairResponsePdu#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public RepairResponsePdu setPadding2(int pPadding2){
    padding2 = (short) pPadding2;
    return this;
}

/** Getter for {@link RepairResponsePdu#padding2}
  * @return value of interest */
public short getPadding2()
{
    return padding2; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    super.marshal(dos);
    try 
    {
       receivingEntityID.marshal(dos);
       repairingEntityID.marshal(dos);
       repairResult.marshal(dos);
       dos.writeByte(padding1);
       dos.writeShort(padding2);
    }
    catch(Exception e)
    {
      System.err.println(e);
    }
}

/**
 * Deserializes an object from a DataInputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataInputStream
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += receivingEntityID.unmarshal(dis);
        uPosition += repairingEntityID.unmarshal(dis);
        repairResult = RepairResponseRepairResult.unmarshalEnum(dis);
        uPosition += repairResult.getMarshalledSize();
        padding1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        padding2 = (short)dis.readUnsignedShort();
        uPosition += 2;
    }
    catch(Exception e)
    { 
      System.err.println(e); 
    }
    return getMarshalledSize();
}

/**
 * Packs an object into the ByteBuffer.
 * @throws java.nio.BufferOverflowException if byteBuffer is too small
 * @throws java.nio.ReadOnlyBufferException if byteBuffer is read only
 * @see java.nio.ByteBuffer
 * @param byteBuffer The ByteBuffer at the position to begin writing
 * @throws Exception ByteBuffer-generated exception
 */
public void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   super.marshal(byteBuffer);
   receivingEntityID.marshal(byteBuffer);
   repairingEntityID.marshal(byteBuffer);
   repairResult.marshal(byteBuffer);
   byteBuffer.put( (byte)padding1);
   byteBuffer.putShort( (short)padding2);
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if byteBuffer is too small
 * @see java.nio.ByteBuffer
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param byteBuffer The ByteBuffer at the position to begin reading
 * @return marshalled serialized size in bytes
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    super.unmarshal(byteBuffer);

    receivingEntityID.unmarshal(byteBuffer);
    repairingEntityID.unmarshal(byteBuffer);
    repairResult = RepairResponseRepairResult.unmarshalEnum(byteBuffer);
    padding1 = (byte)(byteBuffer.get() & 0xFF);
    padding2 = (short)(byteBuffer.getShort() & 0xFFFF);
    return getMarshalledSize();
}

 /*
  * Override of default equals method.  Calls equalsImpl() for content comparison.
  */
@Override
 public boolean equals(Object obj)
 {
    if(this == obj)
      return true;

    if(obj == null)
       return false;

    if(!getClass().isAssignableFrom(obj.getClass())) //if(getClass() != obj.getClass())
        return false;

    return equalsImpl(obj);
 }

@Override
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final RepairResponsePdu rhs = (RepairResponsePdu)obj;

     if( ! (receivingEntityID.equals( rhs.receivingEntityID) )) ivarsEqual = false;
     if( ! (repairingEntityID.equals( rhs.repairingEntityID) )) ivarsEqual = false;
     if( ! (repairResult == rhs.repairResult)) ivarsEqual = false;
     if( ! (padding1 == rhs.padding1)) ivarsEqual = false;
     if( ! (padding2 == rhs.padding2)) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" receivingEntityID: ").append(receivingEntityID).append("\n");
    sb.append(" repairingEntityID: ").append(repairingEntityID).append("\n");
    sb.append(" repairResult: ").append(repairResult).append("\n");
    sb.append(" padding1: ").append(padding1).append("\n");
    sb.append(" padding2: ").append(padding2).append("\n");

   return sb.toString();
 }
} // end of class
