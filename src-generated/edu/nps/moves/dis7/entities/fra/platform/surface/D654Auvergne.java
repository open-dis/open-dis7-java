package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@71ba6d4e;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28659
 */
public class D654Auvergne extends EntityType
{
    /** Default constructor */
    public D654Auvergne()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 15950, Guided-missile Frigate
        setSubCategory((byte)3); // uid 28654, Aquitaine Class
        setSpecific((byte)5); // uid 28659, D654 Auvergne
    }
}
