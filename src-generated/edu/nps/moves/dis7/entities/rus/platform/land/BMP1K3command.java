package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@23cd4ff2;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 12584
 */
public class BMP1K3command extends EntityType
{
    /** Default constructor */
    public BMP1K3command()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 12580, Armored Fighting Vehicle
        setSubCategory((byte)1); // uid 12581, BMP-1
        setSpecific((byte)3); // uid 12584, BMP-1K3 command
    }
}
