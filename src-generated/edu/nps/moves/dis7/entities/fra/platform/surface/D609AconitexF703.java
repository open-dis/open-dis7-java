package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1e0b4072;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 15949
 */
public class D609AconitexF703 extends EntityType
{
    /** Default constructor */
    public D609AconitexF703()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 15929, Guided Missile Destroyer (Fregates or Escorteurs Descadres)
        setSubCategory((byte)5); // uid 15948, Type F 65 (ASW)
        setSpecific((byte)1); // uid 15949, D 609 Aconit (ex-F 703)
    }
}
