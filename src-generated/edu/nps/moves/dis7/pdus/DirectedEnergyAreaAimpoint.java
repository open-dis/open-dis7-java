/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * DE Precision Aimpoint Record. Section 6.2.20.2
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class DirectedEnergyAreaAimpoint extends Object implements Serializable
{
   /** Type of Record enumeration */
   protected int  recordType = (int)4001;

   /** Length of Record */
   protected short  recordLength;

   /** Padding */
   protected short  padding = (short)0;

   /** Number of beam antenna pattern records */
   protected short  beamAntennaPatternRecordCount = (short)0;

   /** Number of DE target energy depositon records */
   protected short  directedEnergyTargetEnergyDepositionRecordCount = (short)0;

   /** list of beam antenna records. See 6.2.9.2 */
   protected List< BeamAntennaPattern > beamAntennaParameterList = new ArrayList< BeamAntennaPattern >();
 
   /** list of DE target deposition records. See 6.2.21.4 */
   protected List< DirectedEnergyTargetEnergyDeposition > directedEnergyTargetEnergyDepositionRecordList = new ArrayList< DirectedEnergyTargetEnergyDeposition >();
 
   private byte[] padding2 = new byte[0]; // pad to 64-bit boundary


/** Constructor */
 public DirectedEnergyAreaAimpoint()
 {
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += 4;  // recordType
   marshalSize += 2;  // recordLength
   marshalSize += 2;  // padding
   marshalSize += 2;  // beamAntennaPatternRecordCount
   marshalSize += 2;  // directedEnergyTargetEnergyDepositionRecordCount
   for(int idx=0; idx < beamAntennaParameterList.size(); idx++)
   {
        BeamAntennaPattern listElement = beamAntennaParameterList.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }
   for(int idx=0; idx < directedEnergyTargetEnergyDepositionRecordList.size(); idx++)
   {
        DirectedEnergyTargetEnergyDeposition listElement = directedEnergyTargetEnergyDepositionRecordList.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }
   marshalSize += padding2.length;

   return marshalSize;
}


/** Setter for {@link DirectedEnergyAreaAimpoint#recordType}
  * @param pRecordType new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyAreaAimpoint setRecordType(int pRecordType)
{
    recordType = pRecordType;
    return this;
}

/** Getter for {@link DirectedEnergyAreaAimpoint#recordType}
  * @return value of interest */
public int getRecordType()
{
    return recordType; 
}

/** Setter for {@link DirectedEnergyAreaAimpoint#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyAreaAimpoint setRecordLength(short pRecordLength)
{
    recordLength = pRecordLength;
    return this;
}
/** Utility setter for {@link DirectedEnergyAreaAimpoint#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyAreaAimpoint setRecordLength(int pRecordLength){
    recordLength = (short) pRecordLength;
    return this;
}

/** Getter for {@link DirectedEnergyAreaAimpoint#recordLength}
  * @return value of interest */
public short getRecordLength()
{
    return recordLength; 
}

/** Setter for {@link DirectedEnergyAreaAimpoint#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyAreaAimpoint setPadding(short pPadding)
{
    padding = pPadding;
    return this;
}
/** Utility setter for {@link DirectedEnergyAreaAimpoint#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyAreaAimpoint setPadding(int pPadding){
    padding = (short) pPadding;
    return this;
}

/** Getter for {@link DirectedEnergyAreaAimpoint#padding}
  * @return value of interest */
public short getPadding()
{
    return padding; 
}

/** Setter for {@link DirectedEnergyAreaAimpoint#beamAntennaParameterList}
  * @param pBeamAntennaParameterList new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyAreaAimpoint setBeamAntennaParameterList(List<BeamAntennaPattern> pBeamAntennaParameterList)
{
    beamAntennaParameterList = pBeamAntennaParameterList;
    return this;
}

/** Getter for {@link DirectedEnergyAreaAimpoint#beamAntennaParameterList}
  * @return value of interest */
public List<BeamAntennaPattern> getBeamAntennaParameterList()
{
    return beamAntennaParameterList; 
}

/** Setter for {@link DirectedEnergyAreaAimpoint#directedEnergyTargetEnergyDepositionRecordList}
  * @param pDirectedEnergyTargetEnergyDepositionRecordList new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyAreaAimpoint setDirectedEnergyTargetEnergyDepositionRecordList(List<DirectedEnergyTargetEnergyDeposition> pDirectedEnergyTargetEnergyDepositionRecordList)
{
    directedEnergyTargetEnergyDepositionRecordList = pDirectedEnergyTargetEnergyDepositionRecordList;
    return this;
}

/** Getter for {@link DirectedEnergyAreaAimpoint#directedEnergyTargetEnergyDepositionRecordList}
  * @return value of interest */
public List<DirectedEnergyTargetEnergyDeposition> getDirectedEnergyTargetEnergyDepositionRecordList()
{
    return directedEnergyTargetEnergyDepositionRecordList; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    try 
    {
       dos.writeInt(recordType);
       dos.writeShort(recordLength);
       dos.writeShort(padding);
       dos.writeShort(beamAntennaParameterList.size());
       dos.writeShort(directedEnergyTargetEnergyDepositionRecordList.size());

       for(int idx = 0; idx < beamAntennaParameterList.size(); idx++)
       {
            BeamAntennaPattern aBeamAntennaPattern = beamAntennaParameterList.get(idx);
            aBeamAntennaPattern.marshal(dos);
       }


       for(int idx = 0; idx < directedEnergyTargetEnergyDepositionRecordList.size(); idx++)
       {
            DirectedEnergyTargetEnergyDeposition aDirectedEnergyTargetEnergyDeposition = directedEnergyTargetEnergyDepositionRecordList.get(idx);
            aDirectedEnergyTargetEnergyDeposition.marshal(dos);
       }

       padding2 = new byte[Align.to64bits(dos)];
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
 * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        recordType = dis.readInt();
        uPosition += 4;
        recordLength = (short)dis.readUnsignedShort();
        uPosition += 2;
        padding = (short)dis.readUnsignedShort();
        uPosition += 2;
        beamAntennaPatternRecordCount = (short)dis.readUnsignedShort();
        uPosition += 2;
        directedEnergyTargetEnergyDepositionRecordCount = (short)dis.readUnsignedShort();
        uPosition += 2;
        for(int idx = 0; idx < beamAntennaPatternRecordCount; idx++)
        {
            BeamAntennaPattern anX = new BeamAntennaPattern();
            uPosition += anX.unmarshal(dis);
            beamAntennaParameterList.add(anX);
        }

        for(int idx = 0; idx < directedEnergyTargetEnergyDepositionRecordCount; idx++)
        {
            DirectedEnergyTargetEnergyDeposition anX = new DirectedEnergyTargetEnergyDeposition();
            uPosition += anX.unmarshal(dis);
            directedEnergyTargetEnergyDepositionRecordList.add(anX);
        }

        padding2 = new byte[Align.from64bits(uPosition,dis)];
        uPosition += padding2.length;
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
   byteBuffer.putInt( (int)recordType);
   byteBuffer.putShort( (short)recordLength);
   byteBuffer.putShort( (short)padding);
   byteBuffer.putShort( (short)beamAntennaParameterList.size());
   byteBuffer.putShort( (short)directedEnergyTargetEnergyDepositionRecordList.size());

   for(int idx = 0; idx < beamAntennaParameterList.size(); idx++)
   {
        BeamAntennaPattern aBeamAntennaPattern = beamAntennaParameterList.get(idx);
        aBeamAntennaPattern.marshal(byteBuffer);
   }


   for(int idx = 0; idx < directedEnergyTargetEnergyDepositionRecordList.size(); idx++)
   {
        DirectedEnergyTargetEnergyDeposition aDirectedEnergyTargetEnergyDeposition = directedEnergyTargetEnergyDepositionRecordList.get(idx);
        aDirectedEnergyTargetEnergyDeposition.marshal(byteBuffer);
   }

   padding2 = new byte[Align.to64bits(byteBuffer)];
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if byteBuffer is too small
 * @see java.nio.ByteBuffer
 * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param byteBuffer The ByteBuffer at the position to begin reading
 * @return marshalled serialized size in bytes
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    recordType = byteBuffer.getInt();
    recordLength = (short)(byteBuffer.getShort() & 0xFFFF);
    padding = (short)(byteBuffer.getShort() & 0xFFFF);
    beamAntennaPatternRecordCount = (short)(byteBuffer.getShort() & 0xFFFF);
    directedEnergyTargetEnergyDepositionRecordCount = (short)(byteBuffer.getShort() & 0xFFFF);
    for(int idx = 0; idx < beamAntennaPatternRecordCount; idx++)
    {
    BeamAntennaPattern anX = new BeamAntennaPattern();
    anX.unmarshal(byteBuffer);
    beamAntennaParameterList.add(anX);
    }

    for(int idx = 0; idx < directedEnergyTargetEnergyDepositionRecordCount; idx++)
    {
    DirectedEnergyTargetEnergyDeposition anX = new DirectedEnergyTargetEnergyDeposition();
    anX.unmarshal(byteBuffer);
    directedEnergyTargetEnergyDepositionRecordList.add(anX);
    }

    padding2 = new byte[Align.from64bits(byteBuffer)];
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

 /**
  * Compare all fields that contribute to the state, ignoring
  * transient and static fields, for <code>this</code> and the supplied object
  * @param obj the object to compare to
  * @return true if the objects are equal, false otherwise.
  */
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final DirectedEnergyAreaAimpoint rhs = (DirectedEnergyAreaAimpoint)obj;

     if( ! (recordType == rhs.recordType)) ivarsEqual = false;
     if( ! (recordLength == rhs.recordLength)) ivarsEqual = false;
     if( ! (padding == rhs.padding)) ivarsEqual = false;

     for(int idx = 0; idx < beamAntennaParameterList.size(); idx++)
        if( ! ( beamAntennaParameterList.get(idx).equals(rhs.beamAntennaParameterList.get(idx)))) ivarsEqual = false;


     for(int idx = 0; idx < directedEnergyTargetEnergyDepositionRecordList.size(); idx++)
        if( ! ( directedEnergyTargetEnergyDepositionRecordList.get(idx).equals(rhs.directedEnergyTargetEnergyDepositionRecordList.get(idx)))) ivarsEqual = false;

    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" recordType: ").append(recordType).append("\n");
    sb.append(" recordLength: ").append(recordLength).append("\n");
    sb.append(" padding: ").append(padding).append("\n");
    sb.append(" padding2: ").append(padding2).append("\n");
    sb.append(" beamAntennaParameterList: ").append("\n");
    beamAntennaParameterList.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});
    sb.append(" directedEnergyTargetEnergyDepositionRecordList: ").append("\n");
    directedEnergyTargetEnergyDepositionRecordList.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
