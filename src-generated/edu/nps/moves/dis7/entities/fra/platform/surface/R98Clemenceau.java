package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5d534f5d;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 15927
 */
public class R98Clemenceau extends EntityType
{
    /** Default constructor */
    public R98Clemenceau()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)1); // uid 15923, Carrier (Porte-Avions)
        setSubCategory((byte)2); // uid 15926, Clemenceau class (CV)
        setSpecific((byte)1); // uid 15927, R 98 Clemenceau
    }
}
