/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 5.10.2 Communicate information about the minefield, including the location, perimeter, and types of mines contained within it.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class MinefieldStatePdu extends MinefieldFamilyPdu implements Serializable
{
   /** Minefield ID */
   protected MinefieldIdentifier  minefieldID = new MinefieldIdentifier(); 

   /** Minefield sequence */
   protected short  minefieldSequence;

   /** force ID uid 6 */
   protected ForceID forceID = ForceID.values()[0];

   /** Number of permieter points */
   protected byte  numberOfPerimeterPoints;

   /** type of minefield */
   protected EntityType  minefieldType = new EntityType(); 

   /** how many mine types */
   protected short  numberOfMineTypes;

   /** location of center of minefield in world coords */
   protected Vector3Double  minefieldLocation = new Vector3Double(); 

   /** orientation of minefield */
   protected EulerAngles  minefieldOrientation = new EulerAngles(); 

   /** appearance bitflags uid 190 */
   protected MinefieldStateAppearanceBitMap appearance = new MinefieldStateAppearanceBitMap();

   /** protocolMode. First two bits are the protocol mode, 14 bits reserved. */
   protected ProtocolMode  protocolMode = new ProtocolMode(); 

   /** perimeter points for the minefield */
   protected List< Vector2Float > perimeterPoints = new ArrayList< Vector2Float >();
 
   /** Type of mines */
   protected List< EntityType > mineType = new ArrayList< EntityType >();
 

/** Constructor */
 public MinefieldStatePdu()
 {
    setPduType( DISPDUType.MINEFIELD_STATE );
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
   marshalSize += minefieldID.getMarshalledSize();
   marshalSize += 2;  // minefieldSequence
   marshalSize += forceID.getMarshalledSize();
   marshalSize += 1;  // numberOfPerimeterPoints
   marshalSize += minefieldType.getMarshalledSize();
   marshalSize += 2;  // numberOfMineTypes
   marshalSize += minefieldLocation.getMarshalledSize();
   marshalSize += minefieldOrientation.getMarshalledSize();
   marshalSize += appearance.getMarshalledSize();
   marshalSize += protocolMode.getMarshalledSize();
   for(int idx=0; idx < perimeterPoints.size(); idx++)
   {
        Vector2Float listElement = perimeterPoints.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }
   for(int idx=0; idx < mineType.size(); idx++)
   {
        EntityType listElement = mineType.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link MinefieldStatePdu#minefieldID}
  * @param pMinefieldID new value of interest
  * @return same object to permit progressive setters */
public MinefieldStatePdu setMinefieldID(MinefieldIdentifier pMinefieldID)
{
    minefieldID = pMinefieldID;
    return this;
}

/** Getter for {@link MinefieldStatePdu#minefieldID}
  * @return value of interest */
public MinefieldIdentifier getMinefieldID()
{
    return minefieldID; 
}

/** Setter for {@link MinefieldStatePdu#minefieldSequence}
  * @param pMinefieldSequence new value of interest
  * @return same object to permit progressive setters */
public MinefieldStatePdu setMinefieldSequence(short pMinefieldSequence)
{
    minefieldSequence = pMinefieldSequence;
    return this;
}
/** Utility setter for {@link MinefieldStatePdu#minefieldSequence}
  * @param pMinefieldSequence new value of interest
  * @return same object to permit progressive setters */
public MinefieldStatePdu setMinefieldSequence(int pMinefieldSequence){
    minefieldSequence = (short) pMinefieldSequence;
    return this;
}

/** Getter for {@link MinefieldStatePdu#minefieldSequence}
  * @return value of interest */
public short getMinefieldSequence()
{
    return minefieldSequence; 
}

/** Setter for {@link MinefieldStatePdu#forceID}
  * @param pForceID new value of interest
  * @return same object to permit progressive setters */
public MinefieldStatePdu setForceID(ForceID pForceID)
{
    forceID = pForceID;
    return this;
}

/** Getter for {@link MinefieldStatePdu#forceID}
  * @return value of interest */
public ForceID getForceID()
{
    return forceID; 
}

/** Setter for {@link MinefieldStatePdu#minefieldType}
  * @param pMinefieldType new value of interest
  * @return same object to permit progressive setters */
public MinefieldStatePdu setMinefieldType(EntityType pMinefieldType)
{
    minefieldType = pMinefieldType;
    return this;
}

/** Getter for {@link MinefieldStatePdu#minefieldType}
  * @return value of interest */
public EntityType getMinefieldType()
{
    return minefieldType; 
}

/** Setter for {@link MinefieldStatePdu#minefieldLocation}
  * @param pMinefieldLocation new value of interest
  * @return same object to permit progressive setters */
public MinefieldStatePdu setMinefieldLocation(Vector3Double pMinefieldLocation)
{
    minefieldLocation = pMinefieldLocation;
    return this;
}

/** Getter for {@link MinefieldStatePdu#minefieldLocation}
  * @return value of interest */
public Vector3Double getMinefieldLocation()
{
    return minefieldLocation; 
}

/** Setter for {@link MinefieldStatePdu#minefieldOrientation}
  * @param pMinefieldOrientation new value of interest
  * @return same object to permit progressive setters */
public MinefieldStatePdu setMinefieldOrientation(EulerAngles pMinefieldOrientation)
{
    minefieldOrientation = pMinefieldOrientation;
    return this;
}

/** Getter for {@link MinefieldStatePdu#minefieldOrientation}
  * @return value of interest */
public EulerAngles getMinefieldOrientation()
{
    return minefieldOrientation; 
}

/** Setter for {@link MinefieldStatePdu#appearance}
  * @param pAppearance new value of interest
  * @return same object to permit progressive setters */
public MinefieldStatePdu setAppearance(MinefieldStateAppearanceBitMap pAppearance)
{
    appearance = pAppearance;
    return this;
}

/** Getter for {@link MinefieldStatePdu#appearance}
  * @return value of interest */
public MinefieldStateAppearanceBitMap getAppearance()
{
    return appearance; 
}

/** Setter for {@link MinefieldStatePdu#protocolMode}
  * @param pProtocolMode new value of interest
  * @return same object to permit progressive setters */
public MinefieldStatePdu setProtocolMode(ProtocolMode pProtocolMode)
{
    protocolMode = pProtocolMode;
    return this;
}

/** Getter for {@link MinefieldStatePdu#protocolMode}
  * @return value of interest */
public ProtocolMode getProtocolMode()
{
    return protocolMode; 
}

/** Setter for {@link MinefieldStatePdu#perimeterPoints}
  * @param pPerimeterPoints new value of interest
  * @return same object to permit progressive setters */
public MinefieldStatePdu setPerimeterPoints(List<Vector2Float> pPerimeterPoints)
{
    perimeterPoints = pPerimeterPoints;
    return this;
}

/** Getter for {@link MinefieldStatePdu#perimeterPoints}
  * @return value of interest */
public List<Vector2Float> getPerimeterPoints()
{
    return perimeterPoints; 
}

/** Setter for {@link MinefieldStatePdu#mineType}
  * @param pMineType new value of interest
  * @return same object to permit progressive setters */
public MinefieldStatePdu setMineType(List<EntityType> pMineType)
{
    mineType = pMineType;
    return this;
}

/** Getter for {@link MinefieldStatePdu#mineType}
  * @return value of interest */
public List<EntityType> getMineType()
{
    return mineType; 
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
       minefieldID.marshal(dos);
       dos.writeShort(minefieldSequence);
       forceID.marshal(dos);
       dos.writeByte(perimeterPoints.size());
       minefieldType.marshal(dos);
       dos.writeShort(mineType.size());
       minefieldLocation.marshal(dos);
       minefieldOrientation.marshal(dos);
       appearance.marshal(dos);
       protocolMode.marshal(dos);

       for(int idx = 0; idx < perimeterPoints.size(); idx++)
       {
            Vector2Float aVector2Float = perimeterPoints.get(idx);
            aVector2Float.marshal(dos);
       }


       for(int idx = 0; idx < mineType.size(); idx++)
       {
            EntityType aEntityType = mineType.get(idx);
            aEntityType.marshal(dos);
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
        uPosition += minefieldID.unmarshal(dis);
        minefieldSequence = (short)dis.readUnsignedShort();
        uPosition += 2;
        forceID = ForceID.unmarshalEnum(dis);
        uPosition += forceID.getMarshalledSize();
        numberOfPerimeterPoints = (byte)dis.readUnsignedByte();
        uPosition += 1;
        uPosition += minefieldType.unmarshal(dis);
        numberOfMineTypes = (short)dis.readUnsignedShort();
        uPosition += 2;
        uPosition += minefieldLocation.unmarshal(dis);
        uPosition += minefieldOrientation.unmarshal(dis);
        uPosition += appearance.unmarshal(dis);
        uPosition += protocolMode.unmarshal(dis);
        for(int idx = 0; idx < numberOfPerimeterPoints; idx++)
        {
            Vector2Float anX = new Vector2Float();
            uPosition += anX.unmarshal(dis);
            perimeterPoints.add(anX);
        }

        for(int idx = 0; idx < numberOfMineTypes; idx++)
        {
            EntityType anX = new EntityType();
            uPosition += anX.unmarshal(dis);
            mineType.add(anX);
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
   minefieldID.marshal(byteBuffer);
   byteBuffer.putShort( (short)minefieldSequence);
   forceID.marshal(byteBuffer);
   byteBuffer.put( (byte)perimeterPoints.size());
   minefieldType.marshal(byteBuffer);
   byteBuffer.putShort( (short)mineType.size());
   minefieldLocation.marshal(byteBuffer);
   minefieldOrientation.marshal(byteBuffer);
   appearance.marshal(byteBuffer);
   protocolMode.marshal(byteBuffer);

   for(int idx = 0; idx < perimeterPoints.size(); idx++)
   {
        Vector2Float aVector2Float = perimeterPoints.get(idx);
        aVector2Float.marshal(byteBuffer);
   }


   for(int idx = 0; idx < mineType.size(); idx++)
   {
        EntityType aEntityType = mineType.get(idx);
        aEntityType.marshal(byteBuffer);
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

    minefieldID.unmarshal(byteBuffer);
    minefieldSequence = (short)(byteBuffer.getShort() & 0xFFFF);
    forceID = ForceID.unmarshalEnum(byteBuffer);
    numberOfPerimeterPoints = (byte)(byteBuffer.get() & 0xFF);
    minefieldType.unmarshal(byteBuffer);
    numberOfMineTypes = (short)(byteBuffer.getShort() & 0xFFFF);
    minefieldLocation.unmarshal(byteBuffer);
    minefieldOrientation.unmarshal(byteBuffer);
    appearance.unmarshal(byteBuffer);
    protocolMode.unmarshal(byteBuffer);
    for(int idx = 0; idx < numberOfPerimeterPoints; idx++)
    {
    Vector2Float anX = new Vector2Float();
    anX.unmarshal(byteBuffer);
    perimeterPoints.add(anX);
    }

    for(int idx = 0; idx < numberOfMineTypes; idx++)
    {
    EntityType anX = new EntityType();
    anX.unmarshal(byteBuffer);
    mineType.add(anX);
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

     final MinefieldStatePdu rhs = (MinefieldStatePdu)obj;

     if( ! (minefieldID.equals( rhs.minefieldID) )) ivarsEqual = false;
     if( ! (minefieldSequence == rhs.minefieldSequence)) ivarsEqual = false;
     if( ! (forceID == rhs.forceID)) ivarsEqual = false;
     if( ! (minefieldType.equals( rhs.minefieldType) )) ivarsEqual = false;
     if( ! (minefieldLocation.equals( rhs.minefieldLocation) )) ivarsEqual = false;
     if( ! (minefieldOrientation.equals( rhs.minefieldOrientation) )) ivarsEqual = false;
     if( ! (appearance.equals( rhs.appearance) )) ivarsEqual = false;
     if( ! (protocolMode.equals( rhs.protocolMode) )) ivarsEqual = false;

     for(int idx = 0; idx < perimeterPoints.size(); idx++)
        if( ! ( perimeterPoints.get(idx).equals(rhs.perimeterPoints.get(idx)))) ivarsEqual = false;


     for(int idx = 0; idx < mineType.size(); idx++)
        if( ! ( mineType.get(idx).equals(rhs.mineType.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" minefieldID: ").append(minefieldID).append("\n");
    sb.append(" minefieldSequence: ").append(minefieldSequence).append("\n");
    sb.append(" forceID: ").append(forceID).append("\n");
    sb.append(" minefieldType: ").append(minefieldType).append("\n");
    sb.append(" minefieldLocation: ").append(minefieldLocation).append("\n");
    sb.append(" minefieldOrientation: ").append(minefieldOrientation).append("\n");
    sb.append(" appearance: ").append(appearance).append("\n");
    sb.append(" protocolMode: ").append(protocolMode).append("\n");
    sb.append(" perimeterPoints: ").append("\n");
    perimeterPoints.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});
    sb.append(" mineType: ").append("\n");
    mineType.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
