/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 5.12.4.15 Used to set or change certain parameter values. These parameter values are contained within a record format as compared to the datum format used in the Set Data-R PDU.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class SetRecordRPdu extends SimulationManagementWithReliabilityFamilyPdu implements Serializable
{
   /** request ID */
   protected int  requestID;

   /** level of reliability service used for this transaction uid 74 */
   protected RequiredReliabilityService requiredReliabilityService = RequiredReliabilityService.values()[0];

   /** pad1 is an undescribed parameter... */
   protected byte  pad1;

   /** pad2 is an undescribed parameter... */
   protected short  pad2;

   /** pad3 is an undescribed parameter... */
   protected int  pad3;

   /** Number of record sets in list */
   protected int  numberOfRecordSets;

   /** record sets */
   protected List< RecordSpecification > recordSets = new ArrayList< RecordSpecification >();
 

/** Constructor */
 public SetRecordRPdu()
 {
    setPduType( DISPDUType.SET_RECORD_RELIABLE );
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
   marshalSize += 4;  // requestID
   marshalSize += requiredReliabilityService.getMarshalledSize();
   marshalSize += 1;  // pad1
   marshalSize += 2;  // pad2
   marshalSize += 4;  // pad3
   marshalSize += 4;  // numberOfRecordSets
   for(int idx=0; idx < recordSets.size(); idx++)
   {
        RecordSpecification listElement = recordSets.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link SetRecordRPdu#requestID}
  * @param pRequestID new value of interest
  * @return same object to permit progressive setters */
public SetRecordRPdu setRequestID(int pRequestID)
{
    requestID = pRequestID;
    return this;
}

/** Getter for {@link SetRecordRPdu#requestID}
  * @return value of interest */
public int getRequestID()
{
    return requestID; 
}

/** Setter for {@link SetRecordRPdu#requiredReliabilityService}
  * @param pRequiredReliabilityService new value of interest
  * @return same object to permit progressive setters */
public SetRecordRPdu setRequiredReliabilityService(RequiredReliabilityService pRequiredReliabilityService)
{
    requiredReliabilityService = pRequiredReliabilityService;
    return this;
}

/** Getter for {@link SetRecordRPdu#requiredReliabilityService}
  * @return value of interest */
public RequiredReliabilityService getRequiredReliabilityService()
{
    return requiredReliabilityService; 
}

/** Setter for {@link SetRecordRPdu#pad1}
  * @param pPad1 new value of interest
  * @return same object to permit progressive setters */
public SetRecordRPdu setPad1(byte pPad1)
{
    pad1 = pPad1;
    return this;
}
/** Utility setter for {@link SetRecordRPdu#pad1}
  * @param pPad1 new value of interest
  * @return same object to permit progressive setters */
public SetRecordRPdu setPad1(int pPad1){
    pad1 = (byte) pPad1;
    return this;
}

/** Getter for {@link SetRecordRPdu#pad1}
  * @return value of interest */
public byte getPad1()
{
    return pad1; 
}

/** Setter for {@link SetRecordRPdu#pad2}
  * @param pPad2 new value of interest
  * @return same object to permit progressive setters */
public SetRecordRPdu setPad2(short pPad2)
{
    pad2 = pPad2;
    return this;
}
/** Utility setter for {@link SetRecordRPdu#pad2}
  * @param pPad2 new value of interest
  * @return same object to permit progressive setters */
public SetRecordRPdu setPad2(int pPad2){
    pad2 = (short) pPad2;
    return this;
}

/** Getter for {@link SetRecordRPdu#pad2}
  * @return value of interest */
public short getPad2()
{
    return pad2; 
}

/** Setter for {@link SetRecordRPdu#pad3}
  * @param pPad3 new value of interest
  * @return same object to permit progressive setters */
public SetRecordRPdu setPad3(int pPad3)
{
    pad3 = pPad3;
    return this;
}

/** Getter for {@link SetRecordRPdu#pad3}
  * @return value of interest */
public int getPad3()
{
    return pad3; 
}

/** Setter for {@link SetRecordRPdu#recordSets}
  * @param pRecordSets new value of interest
  * @return same object to permit progressive setters */
public SetRecordRPdu setRecordSets(List<RecordSpecification> pRecordSets)
{
    recordSets = pRecordSets;
    return this;
}

/** Getter for {@link SetRecordRPdu#recordSets}
  * @return value of interest */
public List<RecordSpecification> getRecordSets()
{
    return recordSets; 
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
       dos.writeInt(requestID);
       requiredReliabilityService.marshal(dos);
       dos.writeByte(pad1);
       dos.writeShort(pad2);
       dos.writeInt(pad3);
       dos.writeInt(recordSets.size());

       for(int idx = 0; idx < recordSets.size(); idx++)
       {
            RecordSpecification aRecordSpecification = recordSets.get(idx);
            aRecordSpecification.marshal(dos);
       }

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
        requestID = dis.readInt();
        uPosition += 4;
        requiredReliabilityService = RequiredReliabilityService.unmarshalEnum(dis);
        uPosition += requiredReliabilityService.getMarshalledSize();
        pad1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        pad2 = (short)dis.readUnsignedShort();
        uPosition += 2;
        pad3 = dis.readInt();
        uPosition += 4;
        numberOfRecordSets = dis.readInt();
        uPosition += 4;
        for(int idx = 0; idx < numberOfRecordSets; idx++)
        {
            RecordSpecification anX = new RecordSpecification();
            uPosition += anX.unmarshal(dis);
            recordSets.add(anX);
        }

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
   byteBuffer.putInt( (int)requestID);
   requiredReliabilityService.marshal(byteBuffer);
   byteBuffer.put( (byte)pad1);
   byteBuffer.putShort( (short)pad2);
   byteBuffer.putInt( (int)pad3);
   byteBuffer.putInt( (int)recordSets.size());

   for(int idx = 0; idx < recordSets.size(); idx++)
   {
        RecordSpecification aRecordSpecification = recordSets.get(idx);
        aRecordSpecification.marshal(byteBuffer);
   }

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

    requestID = byteBuffer.getInt();
    requiredReliabilityService = RequiredReliabilityService.unmarshalEnum(byteBuffer);
    pad1 = (byte)(byteBuffer.get() & 0xFF);
    pad2 = (short)(byteBuffer.getShort() & 0xFFFF);
    pad3 = byteBuffer.getInt();
    numberOfRecordSets = byteBuffer.getInt();
    for(int idx = 0; idx < numberOfRecordSets; idx++)
    {
    RecordSpecification anX = new RecordSpecification();
    anX.unmarshal(byteBuffer);
    recordSets.add(anX);
    }

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

     final SetRecordRPdu rhs = (SetRecordRPdu)obj;

     if( ! (requestID == rhs.requestID)) ivarsEqual = false;
     if( ! (requiredReliabilityService == rhs.requiredReliabilityService)) ivarsEqual = false;
     if( ! (pad1 == rhs.pad1)) ivarsEqual = false;
     if( ! (pad2 == rhs.pad2)) ivarsEqual = false;
     if( ! (pad3 == rhs.pad3)) ivarsEqual = false;

     for(int idx = 0; idx < recordSets.size(); idx++)
        if( ! ( recordSets.get(idx).equals(rhs.recordSets.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" requestID: ").append(requestID).append("\n");
    sb.append(" requiredReliabilityService: ").append(requiredReliabilityService).append("\n");
    sb.append(" pad1: ").append(pad1).append("\n");
    sb.append(" pad2: ").append(pad2).append("\n");
    sb.append(" pad3: ").append(pad3).append("\n");
    sb.append(" recordSets: ").append("\n");
    recordSets.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
