package edu.nps.moves.dis7.entities.isr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5066d65f;
 * Country: Israel (ISR);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 18177
 */
public class GabrielMk3launcher extends EntityType
{
    /** Default constructor */
    public GabrielMk3launcher()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 18174, Self-Propelled Artillery
        setSubCategory((byte)3); // uid 18177, Gabriel Mk 3 launcher
    }
}
