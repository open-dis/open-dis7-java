package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@e6ea0c6;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31302
 */
public class MAPSROWS extends EntityType
{
    /** Default constructor */
    public MAPSROWS()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)50); // uid 31300, Unmanned
        setSubCategory((byte)1); // uid 31301, Mission Adaptable Platform System Unmanned Ground Vehicle (MAPS UGV)
        setSpecific((byte)1); // uid 31302, MAPS ROWS
    }
}
