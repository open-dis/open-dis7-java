package edu.nps.moves.dis7.entities.isr.munition.antiguidedweapon;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@458031da;
 * Country: Israel (ISR);
 * Entity kind: Munition;
 * Domain: ANTI_GUIDED_WEAPON;
 *
 * Entity type uid: 21291
 */
public class Guided extends EntityType
{
    /** Default constructor */
    public Guided()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_GUIDED_WEAPON));

        setCategory((byte)1); // uid 21291, Guided
    }
}
