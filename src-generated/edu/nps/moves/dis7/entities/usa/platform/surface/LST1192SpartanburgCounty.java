package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7f3ca64a;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11675
 */
public class LST1192SpartanburgCounty extends EntityType
{
    /** Default constructor */
    public LST1192SpartanburgCounty()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 11660, Tank Landing Ship
        setSubCategory((byte)1); // uid 11661, Newport Class
        setSpecific((byte)14); // uid 11675, LST 1192 Spartanburg County
    }
}
