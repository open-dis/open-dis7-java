package edu.nps.moves.dis7.entities.deu.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@14fc1f0;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SPACE;
 *
 * Entity type uid: 16809
 */
public class D3 extends EntityType
{
    /** Default constructor */
    public D3()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)1); // uid 16800, Manned
        setSubCategory((byte)3); // uid 16806, Space Lab
        setSpecific((byte)3); // uid 16809, D3
    }
}
