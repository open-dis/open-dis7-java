package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@847f3e7;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 23445
 */
public class ARS14Kdecontaminationtruck extends EntityType
{
    /** Default constructor */
    public ARS14Kdecontaminationtruck()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 12867, Large Wheeled Utility Vehicle
        setSubCategory((byte)4); // uid 12871, ZIL-131 6x6 3500-kg truck
        setSpecific((byte)12); // uid 23445, ARS-14K decontamination truck
    }
}
