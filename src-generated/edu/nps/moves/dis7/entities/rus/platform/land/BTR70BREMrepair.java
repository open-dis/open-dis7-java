package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@69b2f8e5;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 12699
 */
public class BTR70BREMrepair extends EntityType
{
    /** Default constructor */
    public BTR70BREMrepair()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 12580, Armored Fighting Vehicle
        setSubCategory((byte)12); // uid 12691, BTR-70
        setSpecific((byte)8); // uid 12699, BTR-70 BREM repair
    }
}
