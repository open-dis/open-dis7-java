package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@446c3920
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 14128
 */
public class Borodino extends EntityType
{
    public Borodino()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)44); // uid 14127, Ugra II class (AXT) (training)
        setSpecific((byte)1); // uid 14128, Borodino
    }
}
