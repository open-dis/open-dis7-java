package edu.nps.moves.dis7.entities.bra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4c70fda8;
 * Country: Brazil (BRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28679
 */
public class F42Constituicao extends EntityType
{
    /** Default constructor */
    public F42Constituicao()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 28675, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 28676, Niteroi Class (Vosper Mark 10)
        setSpecific((byte)3); // uid 28679, F 42 Constituicao
    }
}
