package edu.nps.moves.dis7.entities.can.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@11c3ce6a;
 * Country: Canada (CAN);
 * Entity kind: Expendable;
 * Domain: AIR;
 *
 * Entity type uid: 32656
 */
public class MarkerBuoyiSLDMBPIWPersonInWater extends EntityType
{
    /** Default constructor */
    public MarkerBuoyiSLDMBPIWPersonInWater()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)14); // uid 32654, SAR Buoy
        setSubCategory((byte)1); // uid 32655, GPS
        setSpecific((byte)1); // uid 32656, Marker Buoy iSLDMB PIW (Person In Water)
    }
}
