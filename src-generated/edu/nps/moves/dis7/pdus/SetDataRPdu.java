/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 5.12.4.10 Serves the same function as the Set Data PDU but with the addition of reliability service levels.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class SetDataRPdu extends SimulationManagementWithReliabilityFamilyPdu implements Serializable
{
   /** level of reliability service used for this transaction uid 74 */
   protected RequiredReliabilityService requiredReliabilityService = RequiredReliabilityService.values()[0];

   /** padding */
   protected byte  pad1;

   /** padding */
   protected short  pad2;

   /** request ID */
   protected int  requestID;

   /** Fixed datum record count */
   protected int  numberOfFixedDatumRecords;

   /** variable datum record count */
   protected int  numberOfVariableDatumRecords;

   /** Fixed datum records */
   protected List< FixedDatum > fixedDatumRecords = new ArrayList< FixedDatum >();
 
   /** Variable datum records */
   protected List< VariableDatum > variableDatumRecords = new ArrayList< VariableDatum >();
 

/** Constructor */
 public SetDataRPdu()
 {
    setPduType( DISPDUType.SET_DATA_RELIABLE );
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
   marshalSize += requiredReliabilityService.getMarshalledSize();
   marshalSize += 1;  // pad1
   marshalSize += 2;  // pad2
   marshalSize += 4;  // requestID
   marshalSize += 4;  // numberOfFixedDatumRecords
   marshalSize += 4;  // numberOfVariableDatumRecords
   for(int idx=0; idx < fixedDatumRecords.size(); idx++)
   {
        FixedDatum listElement = fixedDatumRecords.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }
   for(int idx=0; idx < variableDatumRecords.size(); idx++)
   {
        VariableDatum listElement = variableDatumRecords.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link SetDataRPdu#requiredReliabilityService}
  * @param pRequiredReliabilityService new value of interest
  * @return same object to permit progressive setters */
public SetDataRPdu setRequiredReliabilityService(RequiredReliabilityService pRequiredReliabilityService)
{
    requiredReliabilityService = pRequiredReliabilityService;
    return this;
}

/** Getter for {@link SetDataRPdu#requiredReliabilityService}
  * @return value of interest */
public RequiredReliabilityService getRequiredReliabilityService()
{
    return requiredReliabilityService; 
}

/** Setter for {@link SetDataRPdu#pad1}
  * @param pPad1 new value of interest
  * @return same object to permit progressive setters */
public SetDataRPdu setPad1(byte pPad1)
{
    pad1 = pPad1;
    return this;
}
/** Utility setter for {@link SetDataRPdu#pad1}
  * @param pPad1 new value of interest
  * @return same object to permit progressive setters */
public SetDataRPdu setPad1(int pPad1){
    pad1 = (byte) pPad1;
    return this;
}

/** Getter for {@link SetDataRPdu#pad1}
  * @return value of interest */
public byte getPad1()
{
    return pad1; 
}

/** Setter for {@link SetDataRPdu#pad2}
  * @param pPad2 new value of interest
  * @return same object to permit progressive setters */
public SetDataRPdu setPad2(short pPad2)
{
    pad2 = pPad2;
    return this;
}
/** Utility setter for {@link SetDataRPdu#pad2}
  * @param pPad2 new value of interest
  * @return same object to permit progressive setters */
public SetDataRPdu setPad2(int pPad2){
    pad2 = (short) pPad2;
    return this;
}

/** Getter for {@link SetDataRPdu#pad2}
  * @return value of interest */
public short getPad2()
{
    return pad2; 
}

/** Setter for {@link SetDataRPdu#requestID}
  * @param pRequestID new value of interest
  * @return same object to permit progressive setters */
public SetDataRPdu setRequestID(int pRequestID)
{
    requestID = pRequestID;
    return this;
}

/** Getter for {@link SetDataRPdu#requestID}
  * @return value of interest */
public int getRequestID()
{
    return requestID; 
}

/** Setter for {@link SetDataRPdu#fixedDatumRecords}
  * @param pFixedDatumRecords new value of interest
  * @return same object to permit progressive setters */
public SetDataRPdu setFixedDatumRecords(List<FixedDatum> pFixedDatumRecords)
{
    fixedDatumRecords = pFixedDatumRecords;
    return this;
}

/** Getter for {@link SetDataRPdu#fixedDatumRecords}
  * @return value of interest */
public List<FixedDatum> getFixedDatumRecords()
{
    return fixedDatumRecords; 
}

/** Setter for {@link SetDataRPdu#variableDatumRecords}
  * @param pVariableDatumRecords new value of interest
  * @return same object to permit progressive setters */
public SetDataRPdu setVariableDatumRecords(List<VariableDatum> pVariableDatumRecords)
{
    variableDatumRecords = pVariableDatumRecords;
    return this;
}

/** Getter for {@link SetDataRPdu#variableDatumRecords}
  * @return value of interest */
public List<VariableDatum> getVariableDatumRecords()
{
    return variableDatumRecords; 
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
       requiredReliabilityService.marshal(dos);
       dos.writeByte(pad1);
       dos.writeShort(pad2);
       dos.writeInt(requestID);
       dos.writeInt(fixedDatumRecords.size());
       dos.writeInt(variableDatumRecords.size());

       for(int idx = 0; idx < fixedDatumRecords.size(); idx++)
       {
            FixedDatum aFixedDatum = fixedDatumRecords.get(idx);
            aFixedDatum.marshal(dos);
       }


       for(int idx = 0; idx < variableDatumRecords.size(); idx++)
       {
            VariableDatum aVariableDatum = variableDatumRecords.get(idx);
            aVariableDatum.marshal(dos);
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
        requiredReliabilityService = RequiredReliabilityService.unmarshalEnum(dis);
        uPosition += requiredReliabilityService.getMarshalledSize();
        pad1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        pad2 = (short)dis.readUnsignedShort();
        uPosition += 2;
        requestID = dis.readInt();
        uPosition += 4;
        numberOfFixedDatumRecords = dis.readInt();
        uPosition += 4;
        numberOfVariableDatumRecords = dis.readInt();
        uPosition += 4;
        for(int idx = 0; idx < numberOfFixedDatumRecords; idx++)
        {
            FixedDatum anX = new FixedDatum();
            uPosition += anX.unmarshal(dis);
            fixedDatumRecords.add(anX);
        }

        for(int idx = 0; idx < numberOfVariableDatumRecords; idx++)
        {
            VariableDatum anX = new VariableDatum();
            uPosition += anX.unmarshal(dis);
            variableDatumRecords.add(anX);
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
   requiredReliabilityService.marshal(byteBuffer);
   byteBuffer.put( (byte)pad1);
   byteBuffer.putShort( (short)pad2);
   byteBuffer.putInt( (int)requestID);
   byteBuffer.putInt( (int)fixedDatumRecords.size());
   byteBuffer.putInt( (int)variableDatumRecords.size());

   for(int idx = 0; idx < fixedDatumRecords.size(); idx++)
   {
        FixedDatum aFixedDatum = fixedDatumRecords.get(idx);
        aFixedDatum.marshal(byteBuffer);
   }


   for(int idx = 0; idx < variableDatumRecords.size(); idx++)
   {
        VariableDatum aVariableDatum = variableDatumRecords.get(idx);
        aVariableDatum.marshal(byteBuffer);
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

    requiredReliabilityService = RequiredReliabilityService.unmarshalEnum(byteBuffer);
    pad1 = (byte)(byteBuffer.get() & 0xFF);
    pad2 = (short)(byteBuffer.getShort() & 0xFFFF);
    requestID = byteBuffer.getInt();
    numberOfFixedDatumRecords = byteBuffer.getInt();
    numberOfVariableDatumRecords = byteBuffer.getInt();
    for(int idx = 0; idx < numberOfFixedDatumRecords; idx++)
    {
    FixedDatum anX = new FixedDatum();
    anX.unmarshal(byteBuffer);
    fixedDatumRecords.add(anX);
    }

    for(int idx = 0; idx < numberOfVariableDatumRecords; idx++)
    {
    VariableDatum anX = new VariableDatum();
    anX.unmarshal(byteBuffer);
    variableDatumRecords.add(anX);
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

     final SetDataRPdu rhs = (SetDataRPdu)obj;

     if( ! (requiredReliabilityService == rhs.requiredReliabilityService)) ivarsEqual = false;
     if( ! (pad1 == rhs.pad1)) ivarsEqual = false;
     if( ! (pad2 == rhs.pad2)) ivarsEqual = false;
     if( ! (requestID == rhs.requestID)) ivarsEqual = false;

     for(int idx = 0; idx < fixedDatumRecords.size(); idx++)
        if( ! ( fixedDatumRecords.get(idx).equals(rhs.fixedDatumRecords.get(idx)))) ivarsEqual = false;


     for(int idx = 0; idx < variableDatumRecords.size(); idx++)
        if( ! ( variableDatumRecords.get(idx).equals(rhs.variableDatumRecords.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" requiredReliabilityService: ").append(requiredReliabilityService).append("\n");
    sb.append(" pad1: ").append(pad1).append("\n");
    sb.append(" pad2: ").append(pad2).append("\n");
    sb.append(" requestID: ").append(requestID).append("\n");
    sb.append(" fixedDatumRecords: ").append("\n");
    fixedDatumRecords.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});
    sb.append(" variableDatumRecords: ").append("\n");
    variableDatumRecords.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
