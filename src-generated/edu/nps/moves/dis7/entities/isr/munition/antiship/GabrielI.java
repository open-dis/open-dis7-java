package edu.nps.moves.dis7.entities.isr.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@463045fb;
 * Country: Israel (ISR);
 * Entity kind: Munition;
 * Domain: ANTI_SHIP;
 *
 * Entity type uid: 21297
 */
public class GabrielI extends EntityType
{
    /** Default constructor */
    public GabrielI()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 21295, Guided
        setSubCategory((byte)1); // uid 21296, Gabriel
        setSpecific((byte)1); // uid 21297, Gabriel I
    }
}
